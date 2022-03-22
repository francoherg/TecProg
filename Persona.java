package test;
import java.util.Calendar;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Persona {
	private String nombre,apellido;
	private int dni;

	private java.util.Calendar nacimiento; //fecha nacimiento
	
	
	public Persona(String apellido, String nombre, int dni, Calendar nacimiento) {
	this.nombre = nombre;
	this.apellido= apellido;
	this.dni=dni;
	this.nacimiento=nacimiento;
	}

	private int Edad(Calendar nac) {
		Calendar today = new java.util.GregorianCalendar();
        today.setTime(new java.util.Date());
        
        int yeardiff= today.get(Calendar.YEAR)- nac.get(Calendar.YEAR);
        int monthdiff= today.get(Calendar.MONTH)- nac.get(Calendar.MONTH);
        int daydiff= today.get(Calendar.DATE)- nac.get(Calendar.DATE);
        
        if (daydiff<0) {
        	daydiff+=31;
        	monthdiff--;
        }
        if(monthdiff<0) {
        	monthdiff+=12;
        	yeardiff--;
        }
        return yeardiff;
	}
	private String whichday() {
		Calendar today = new java.util.GregorianCalendar();
		today.setTime(new java.util.Date());
		Calendar bday= new java.util.GregorianCalendar(today.get(Calendar.YEAR),nacimiento.get(Calendar.MONTH),nacimiento.get(Calendar.DATE));
		int wd= bday.get(Calendar.DAY_OF_WEEK);
		switch(wd) {
			case 2:
			return "Lunes";

			case 3:
			return "Martes";

			case 4:
			return "Miércoles";
			
			case 5:
			return "Jueves";

			case 6:
			return "Viernes";

			case 7:
			return "Sábado";
			
			case 1:
			return "Domingo";
		}
		return "Date error";
	}
	public void mostrar() {
		System.out.println(apellido + " "+ nombre +  ": "+ Edad(nacimiento)+ " años. Dia: " + whichday());
	}
    //algoritmos
    public static String MD2 = "MD2";
    public static String MD5 = "MD5";
    public static String SHA1 = "SHA-1";
    public static String SHA256 = "SHA-256";
    public static String SHA384 = "SHA-384";
    public static String SHA512 = "SHA-512";
    
    
    private static String toHexadecimal(byte[] digest){
        String hash = "";
        for(byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) hash += "0";
            hash += Integer.toHexString(b);
        }
        return hash;
    }
    
    public static String getStringMessageDigest(String message, String algorithm){
        byte[] digest = null;
        byte[] buffer = message.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.reset();
            messageDigest.update(buffer);
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error creando Digest");
        }
        return toHexadecimal(digest);
    }
	private String password;
	
	public boolean Validate(String password) {
		this.password = getStringMessageDigest("password", SHA256);
		if(this.password.equals(password)) {
			return true;
		}
		else return false;
	}


	
	
	
	
	
	
	
	

}