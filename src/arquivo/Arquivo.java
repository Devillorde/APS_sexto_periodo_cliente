package arquivo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

public class Arquivo {

    public static byte[] emBytes(File file) throws IOException,FileNotFoundException {
        int tamanho = (int) file.length();
        byte[] arquivo = new byte[tamanho];
        java.io.FileInputStream inFile = null;
            inFile = new java.io.FileInputStream(file);
            inFile.read(arquivo, 0, tamanho);
        return arquivo;
    }

    public static void emArquivo(byte[] arqui,String nome) {
        try {
            OutputStream output = new FileOutputStream("C:\\Users\\devil\\Desktop\\Renato\\Ciência da Computação\\Cerberus\\" + nome);
            output.write(arqui);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
    public static byte[] removeBytes(byte[] array) {
        byte[] b;
        if (array.length > 5120) {
            b = new byte[array.length - 5120];
        } else {
            b = new byte[array.length];
        }
        int j = 0;
        for (int i = 5120; i < array.length; i++) {
            b[j] = array[i];
            j++;
        }
        return b;
    }

    public static byte[] copyByte(byte[] array) {
        byte[] b = new byte[5120];
        if (array.length < 5120) {
            b = new byte[array.length];
        }
        System.arraycopy(array, 0, b, 0, 5120);
        return b;
    }

    public static byte[] binding(byte[] first, byte[] last) {
        byte[] b = new byte[first.length + last.length];
        System.arraycopy(first, 0, b, 0, first.length);
        int j = 0;
        System.arraycopy(last, 0, b, first.length, last.length);
        return b;
    }
    public static byte[] adjustBytes(byte[] original,int size){
        byte[]b=new byte[size];
        System.arraycopy(original, 0, b, 0, size);
        return b;
    }
    public static String getData()
    {
        Calendar c = Calendar.getInstance();
        String data;
        data=c.get(Calendar.YEAR)+""+(c.get(Calendar.MONTH)+1)+""+c.get(Calendar.DATE)+"_"+c.get(Calendar.HOUR_OF_DAY)+""+c.get(Calendar.MINUTE)+""+c.get(Calendar.SECOND);
        return data;
    }
    public static int compareImage(BufferedImage img1, BufferedImage img2) {
        int cont = 0;
        int cont2 = 0;
        for (int i = 0; i < img1.getWidth(); i++) {
            for (int j = 0; j < img1.getHeight(); j++) {

                if (img1.getRGB(i, j) == img2.getRGB(i, j)) {
                    cont = cont + 1;
                }else{
                    cont2 = cont2 + 1;
                }
            }
        }
        int total = cont + cont2;
        int porcen = (cont * 100) / total;

        System.out.println("Comparação:" + cont + "\nImagem total:" + (cont + cont2) + "\nporcetagem:" + porcen + "%");
        return porcen;
    }
}
