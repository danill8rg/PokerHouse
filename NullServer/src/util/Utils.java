package util;

import java.io.FileDescriptor;
import java.io.FileOutputStream;

import service.ImagemDenunciaService;
import service.impl.ImagemDenunciaServiceImpl;

public class Utils {
	
	public static String SalvarImagm(byte[] bytes, String formato) throws Exception {
		String file = null;
		ImagemDenunciaService serviceImagem =  new ImagemDenunciaServiceImpl();
		String nome = serviceImagem.proximoIdImagem();
		file = nome;
		byte[] imgBytes = bytes;
	    try {
	    	file =  "/var/tomcat7/webapps/NullPointer/ImagemDenuncia/" + nome + "." + formato;
	    	FileOutputStream fos = new FileOutputStream(file);
	        fos.write(imgBytes);
	        FileDescriptor fd = fos.getFD();
	        fos.flush();
	        fd.sync();
	        fos.close();
	        } catch (Exception e) {
	            throw new Exception(    "Erro ao converter os bytes recebidos para imagem");
	        }
	    return file;
	}

}