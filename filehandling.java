import java.io.*;

class FileHandling {
    public static void main(String[] args) throws IOException {
        String inputFile = "C://Users//BIBHAV KUMAR//OneDrive//Desktop//Java HandsOn//StreamIO//inputfile.txt";
        String outputFile = "C://Users//BIBHAV KUMAR//OneDrive//Desktop//Java HandsOn//StreamIO//outputfile.txt";

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Reading from input and writing to output
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Data copied successfully from " + inputFile + " to " + outputFile);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
