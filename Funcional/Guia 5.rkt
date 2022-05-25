
;Ej 1
(define reverse-ls
  (lambda (ls)
    (if (null? ls)
    '()
    (concatenar (reverse-ls (cdr ls)) (list (car ls))))))

(define concatenar
  (lambda (l1 l2)
    (if (null? l1)
        l2
        (cons (car l1) (concatenar (cdr l1) l2)))))
(define conctat-inv
  (lambda (ls1 ls2)
    (concatenar ls1 (reverse-ls ls2))))
;(conctat-inv '(1 2 3) '(4 5 6))

;Ej 2
(define belongs
  (lambda (x ls)
    (if (null? ls)
        #f
        (if (eqv? x (car ls))
            #t
            (belongs x (cdr ls))))))
(define pertenece
  (lambda (x ls1 ls2)
    (and (belongs x ls1) (belongs x ls2))))
;(pertenece 'a '(a b c) '(r f g a))
;(pertenece 'a '(a b c) '(r f g h))

;Ej 3
(define cant-izq
  (lambda (x ls)
    (if (belongs x ls)
        (if (null? ls)
            0
            (if (eqv? x (car ls))
                0
                (+ 1 (cant-izq x (cdr ls)))))
        (display "el elemento no pertenece a la lista"))))
;(cant-izq 'd '(a b c d e f))

;Ej 4
(define addif
  (lambda (x ls)
    (if (belongs x ls)
        ls
        (concatenar ls (list x)))))
;(addif 'a '(b c d))
;(addif 'a '(a b c d))
;(addif 'c '(b c d))

;Ej 5
(define fechap
  (lambda (dia mes anio)
    (cond
      [(or (> mes 12) (< mes 1) (< dia 1) (> dia 31))
       #f]
      [(or (and (eqv? mes 2) (> dia 28)) (and (> dia 30) (or  (eqv? mes 4)  (eqv? mes 6)  (eqv? mes 9)  (eqv? mes 11))))
       #f]
      [else
       #t]
      )))
#|
(fechap 12 12 1986)
(fechap 12 30 1987)
(fechap 31 2 1986)
(fechap 31 11 1876)|#
;Ej 6
(define mayor
  (lambda (ls)
    (let ((elem1 (car ls)))
                    (if (= (length ls) 1)
                        elem1
                        (let ((elem2 (mayor(cdr ls))))
                          (if (>  elem2  elem1)
                              elem2
                              elem1
                              ))))))
(define get-profundidad
  (lambda (elem)
    (if (null? elem)
        0
        (if (list? elem)
        (+ 1 (mayor (map (lambda (x) (get-profundidad x)) elem)))
        -1))))

;(get-profundidad '((1 (2)) (((5 7))) 4))
;Ej 7
(define unpack
  (lambda (ls)
    (if (list? ls)
        (if (null? ls)
            ()
            (if (list? (car ls))
            (concatenar (car ls) (unpack (cdr ls)))
            (concatenar (list (car ls)) (unpack (cdr ls)))))
        ls)))

(define aplanar
  (lambda (ls)
    (if (list? ls)
        (unpack (map (lambda (x) (unpack  (aplanar x))) ls))
        ls)))
(aplanar '(((a (c (f) d))) (b) e))
;Ej 8
(define get-last
  (lambda (ls)
    (if (null? (cdr ls))
        (car ls)
        (get-last (cdr ls)))))
;(get-last '(1 2 3 4))
(define rotar
  (lambda (dir ls)
    (if (symbol=? dir 'derecha)
        (cons (get-last ls) (reverse-ls (cdr (reverse-ls ls))))
        (concatenar (cdr ls) (list (car ls)))
        )))

;(rotar 'derecha '(1 2 3 4))
;(rotar 'izquierda '(1 2 3 4))

;Ej 9
(define calcula-cuadrados
  (lambda (ls)
    (map (lambda (x) (* x x)) ls)))
;(calcula-cuadrados '(1 2 3 4))

;Ej 10
(define del-elem
  (lambda (x ls)
    (if (null? ls)
        ls
        (if (eqv? x (car ls))
            (del-elem x (cdr ls))
            (cons (car ls) (del-elem x (cdr ls)))))))

(define resta-listas
  (lambda (ls ls2)
    (if (null? ls2)
        ls
        (resta-listas (del-elem (car ls2) ls) (cdr ls2)))))
;(resta-listas '(1 2 3 4) '(2 3))
;Ej 11
(define suma-listas
  (lambda (ls ls2)
    (if (null? ls2)
        ls
        (if (belongs (car ls2) ls)
            (suma-listas ls (cdr ls2))
            (suma-listas (concatenar ls (list (car ls2))) (cdr ls2))))))
;(suma-listas '(1 2 3 4) '(2 3 5))

(define get-altura
  (lambda (ls)
    (+ 2 (get-profundidad ls))))