// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.*;
import java.net.URL;
import java.net.*;
import java.io.*;
import java.io.IOException;
import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.zip.CRC32;
import java.util.concurrent.TimeUnit;



public class Main{
    public static void main(String args[]) throws IOException{
        String csvFile = "C:\\Users\\SuryaSabari\\Downloads\\t1 - Sheet1.csv";
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        FileWriter myWriter = new FileWriter("C:\\Users\\SuryaSabari\\Desktop\\TEXT.txt");
        Path path = Paths.get("C:\\Users\\SuryaSabari\\Desktop\\TEXT.txt");
        String line;
        String a[]=new String[100];
        String b[]=new String[100];
        int sc1[]=new int[25];
        int wk1[]=new int[25];
        int sc2[]=new int[25];
        int wk2[]=new int[25];
        String scf1[]=new String[20];
        String scf2[]=new String[25];
        int i=0;
        while ((line = br.readLine()) != null) {
            String cvsSplitBy = ",";
            String[] cols = line.split(cvsSplitBy);
            a[i]=cols[1];
            b[i]=cols[2];
            i++;
        }
        int PORT = 0 ;
        int BUFFER_SIZE = 1024;
        int k=0;
        System.out.println( "\n\n\t\t\t\t\t\t\t\t\t\tTATA IPL 2023\n\t\t\t\t\t\t\t\t\t  IPL QUALIFIER - 1\n\t\t\t\t\t\t\tCHENNAI SUPER KINGS VS GUJARAT TITANS\n\nPitch report :Welcome to the pitch report, folks. We're here at Chepauk, and let's take a closer look at the conditions today. The pitch seems to be a batsman's paradise, \noffering good bounce and even carry. The surface appears to be dry, which means spinners might come into play as the match progresses. \nThe outfield is lightning fast, so any well-timed shots will race away to the boundaries.");
        try {
            myWriter.write( "\n\n\t\t\t\t\t\t\t\t\t\tTATA IPL 2023\n\t\t\t\t\t\t\t\t\t  IPL QUALIFIER - 1\n\t\t\t\t\t\t\tCHENNAI SUPER KINGS VS GUJARAT TITANS\n\nPitch report :Welcome to the pitch report, folks. We're here at Chepauk, and let's take a closer look at the conditions today. The pitch seems to be a batsman's paradise, \noffering good bounce and even carry. The surface appears to be dry, which means spinners might come into play as the match progresses. The outfield is lightning fast, so any well-timed shots will race away to the boundaries.");
            myWriter.write("The match is about to start. CSK has won the toss and elected to bat first. Let us welcome the commentators of the night\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for(int f=0;f<21;f++){
            if(f!=0){
                String[] parts = a[f].split("/");
                int x=0;
                for (String part : parts) {
                    int number = Integer.parseInt(part);
                    if(x==0)
                        sc1[f-1]=number;
                    else
                        wk1[f-1]=number;
                    x++;

                }
            }
        }
        for(int f=0;f<21;f++){
            if(f!=0){
                String[] parts = b[f].split("/");
                int x=0;
                for (String part : parts){
                    int number = Integer.parseInt(part);
                    if(x==0)
                        sc2[f-1]=number;
                    else
                        wk2[f-1]=number;
                    x++;
                }
            }
        }
        Path path1 = Paths.get("C:\\Users\\SuryaSabari\\Desktop\\te1.txt");
        Path path2 = Paths.get("C:\\Users\\SuryaSabari\\Desktop\\te2.txt");
        for(int f=0;f<20;f++){
            if(f!=0){
                scf1[f]=Integer.toString(sc1[f]-sc1[f-1])+"/"+Integer.toString(wk1[f]-wk1[f-1]);
                scf2[f]=Integer.toString(sc2[f]-sc2[f-1])+"/"+Integer.toString(wk2[f]-wk2[f-1]);
            }
            else if(f==0){
                scf1[f]=Integer.toString(sc1[f])+"/"+Integer.toString(wk1[f]);
                scf2[f]=Integer.toString(sc2[f])+"/"+Integer.toString(wk2[f]);

            }
            else if(f>=19)
                break;
        }
        int rd[]=new int[20];
        for(int f=0;f<20;f++){
            Random r=new Random();
            rd[f]=r.nextInt(4);
        }
        int[] ports=new int[4];
        int portNumber = 9876;
        DatagramSocket serverSocket = new DatagramSocket(portNumber);

        System.out.println("The match is about to start. CSK has won the toss and elected to bat first. Let us welcome the commentators of the night\n");

        String fh ="\n\n\t\t\t\t\t\t\t\t\t\tTATA IPL 2023\n\t\t\t\t\t\t\t\t\t  IPL QUALIFIER - 1\n\t\t\t\t\t\t\tCHENNAI SUPER KINGS VS GUJARAT TITANS\n\nPitch report :Welcome to the pitch report, folks. We're here at Chepauk, and let's take a closer look at the conditions today. The pitch seems to be a batsman's paradise, \noffering good bounce and\n even carry. The surface appears to be dry, which means spinners might come into play as the match progresses. The outfield is lightning fast, so any well-timed shots will race away to the boundaries."+
                "\nThe match is about to start. CSK has won the toss and elected to bat first.\n Let us welcome the commentators of the night\n\n";

        String comment[]=new String[]{"Harsha Bhogle","Sunil Gavaskar","Danny Morrison","Irfan Pathan"};

        CRC32 crc32 = new CRC32();
        while (k<4) {
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            InetAddress clientIPAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();
            //System.out.print(receiveData);

            InetAddress serverIPAddress = serverSocket.getLocalAddress();

            try {
                TimeUnit.SECONDS.sleep(5);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            String sentence = new String(receivePacket.getData()).trim();

            crc32.update(sentence.getBytes());
            long checksum = crc32.getValue();
            fh+='\n'+comment[k]+" : "+sentence;
            ports[k]=clientPort;

            byte[] ipHeader = Arrays.copyOfRange(receivePacket.getData(), 0, 20);

            // Extract IP header details
            int version = (ipHeader[0] & 0xFF) >> 4;
            int headerLength = (ipHeader[0] & 0x0F) * 4;
            int priority = (ipHeader[1] & 0xE0) >> 5;
            int totalLength = ((ipHeader[2] & 0xFF) << 8) | (ipHeader[3] & 0xFF);
            int identification = ((ipHeader[4] & 0xFF) << 8) | (ipHeader[5] & 0xFF);
            int flags = (ipHeader[6] & 0xE0) >> 5;
            int fragmentOffset = ((ipHeader[6] & 0x1F) << 8) | (ipHeader[7] & 0xFF);
            int timeToLive = ipHeader[8] & 0xFF;
            int protocol = ipHeader[9] & 0xFF;
            int headerChecksum = ((ipHeader[10] & 0xFF) << 8) | (ipHeader[11] & 0xFF);
            String sourceIP = InetAddress.getByAddress(Arrays.copyOfRange(ipHeader, 12, 16)).getHostAddress();
            String destinationIP = InetAddress.getByAddress(Arrays.copyOfRange(ipHeader, 16, 20)).getHostAddress();
            int packetLength = receivePacket.getLength();
            byte[] payloadData = new byte[packetLength];
            if(k==0) {
                System.out.print("\n=================HEADER DETAILS====================\n");
                System.out.println("IP Header Details:");
                System.out.println("CRC32 Checksum: " + checksum);
                System.out.println("Version: " + version);
                System.out.println("Header Length: " + headerLength + " bytes");
                System.out.println("Priority: " + priority);
                //System.out.println("Payload data: " + Arrays.toString(payloadData));
                System.out.println("Total Length: " + totalLength + " bytes");
                System.out.println("Identification: " + identification);
                System.out.println("Flags: " + flags);
                System.out.println("Fragment Offset: " + fragmentOffset);
                System.out.println("Time to Live: " + timeToLive);
                System.out.println("Protocol: 173");
                //System.out.println("Header Checksum: " + headerChecksum);
                System.out.println("Source IP Address: " + sourceIP);
                System.out.println("Destination IP Address: " + destinationIP);
                System.out.print("\n===============================================\n");
                System.out.print("\n=================PACKET ANALYSIS==================\n");
                System.out.println("Source port :"+serverSocket.getLocalPort());
                System.out.println("Destination port : "+receivePacket.getPort());
                System.out.println("Transport type : UDP");
                System.out.println("Packet's length : "+receivePacket.getLength());
                System.out.println("Payload data : "+sentence);
                System.out.print("\n===============================================\n");

            }
            System.out.println(comment[k] + ":"+sentence );
            k++;
        }
        String fh1="BEGINNING OF INNINGS - 1";
        k=0;
        InetAddress IPAddress = InetAddress.getByName("localhost");
        System.out.print("\n"+"===========================BEGINNING OF INNINGS - 1=========================================="+"\n\n");
        while(k<20) {
        {
            byte[] receiveData = new byte[1024];
            byte[] sendData;

            if((k!=6)&&(k!=13)) {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            else if((k==6)||(k==13)) {
                String fdg="998/98";
                System.out.print("\n\n====================================STRATEGIC TIMEOUT==============================================================\n\n");
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                sendData = fdg.getBytes();
                DatagramPacket sendPacket2 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[0]);
                DatagramPacket sendPacket3 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[1]);
                DatagramPacket sendPacket4 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[2]);
                DatagramPacket sendPacket5 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[3]);
                serverSocket.send(sendPacket2);
                serverSocket.send(sendPacket3);
                serverSocket.send(sendPacket4);
                serverSocket.send(sendPacket5);
            }
            System.out.print("\nOver : "+(k+1)+"\nScore : "+sc1[k]+"/"+wk1[k]);
            double as=((double)(sc1[k])/(k+1));
            BigDecimal bd = new BigDecimal(as).setScale(2, RoundingMode.HALF_UP);
            double newNum = bd.doubleValue();
            System.out.print("\nRun rate :"+newNum);
            sendData = scf1[k].getBytes();
            DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[rd[k]]);
            serverSocket.send(sendPacket1);
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData()).trim();
            System.out.println('\n'+comment[rd[k]] +" : "+ sentence);
            fh1+='\n'+"Overs : "+(k+1)+"\nScore : "+sc1[k]+"/"+wk1[k]+'\n'+comment[rd[k]] +" : "+ sentence+'\n';
        }
        k++;
       }
        System.out.print("\n===========================END OF INNINGS - 1==========================================");
        k=0;
        int r1[]=new int[20];
        for(int f=0;f<20;f++){
            Random r=new Random();
            r1[f]=r.nextInt(4);
        }
        String fh2="\nBEGINNING OF INNINGS - 2";
        System.out.print("\n\t\t\t\t\t\t\tINNINGS REPORT\n\n====================================================================================================\n\n");
        String filePath = "C:/Users/SuryaSabari/Desktop/ALL COMMENTRIES/INNINGS REPORT- CSK.txt"; // Replace with the actual file path
        String xn="";
        String yn="";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String sum;
            while ((sum = reader.readLine()) != null) {
                System.out.println(sum);
                fh1+='\n'+sum;
                xn+='\n'+sum;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.print("\n"+"===========================BEGINNING OF INNINGS - 2=========================================="+"\n\n");
        while(k<21) {
            if(k<20) {

                if((k!=6)&&(k!=13)) {
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                else if((k==6)||(k==13)) {
                    System.out.print("\n\n=================================STRATEGIC TIMEOUT======================================================================\n\n");
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                byte[] receiveData = new byte[1024];
                byte[] sendData;
                System.out.print("\nOver : "+(k+1)+"\nScore : "+sc2[k]+"/"+wk2[k]);
                double as=((double)(sc2[k])/(k+1));
                BigDecimal bd = new BigDecimal(as).setScale(2, RoundingMode.HALF_UP);
                double newNum = bd.doubleValue();
                System.out.print("\nRun rate : "+newNum);
                sendData = scf2[k].getBytes();
                DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[r1[k]]);
                serverSocket.send(sendPacket1);
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String sentence = new String(receivePacket.getData()).trim();
                System.out.println('\n'+comment[rd[k]] +" : "+ sentence);
                fh2+='\n'+"Overs : "+(k+1)+"\nScore : "+sc2[k]+"/"+wk2[k]+'\n'+comment[rd[k]] +" : "+ sentence+'\n';

            }
            else {
                byte[] receiveData = new byte[1024];
                byte[] sendData = new byte[1024];
                String fk="999/99";
                sendData=fk.getBytes();
                DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[0]);
                serverSocket.send(sendPacket1);
                DatagramPacket sendPacket2 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[1]);
                serverSocket.send(sendPacket2);
                DatagramPacket sendPacket3 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[2]);
                serverSocket.send(sendPacket3);
                DatagramPacket sendPacket4 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[3]);
                serverSocket.send(sendPacket4);
            }
            k++;
        }
        System.out.print("\n===========================END OF INNINGS - 2==========================================\n\n");
        System.out.print("\n\t\t\t\t\t\t\tINNINGS REPORT\n\n====================================================================================================\n\n");
        String filePath1 = "C:\\Users\\SuryaSabari\\Desktop\\ALL COMMENTRIES\\INNINGS REPORT - GT.txt"; // Replace with the actual file path
        BufferedReader reader1 = null;
        try {
            reader1 = new BufferedReader(new FileReader(filePath1));
            String sum1;
            while ((sum1 = reader1.readLine()) != null) {
                fh2+='\n'+sum1;
                yn+='\n'+sum1;
                System.out.println(sum1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader1 != null) {
                try {
                    reader1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String res="\n\nMATCH RESULT : CSK HAS WON BY "+(sc1[19]-sc2[19])+" RUNS\n";
        System.out.print("\nMATCH RESULT : CSK HAS WON BY "+(sc1[19]-sc2[19])+" RUNS\n");
        fh2+="\n\nMATCH RESULT : CSK HAS WON BY "+(sc1[19]-sc2[19])+" RUNS\n";
        try {
            Files.writeString(path,fh,StandardCharsets.UTF_8);
            Files.writeString(path1,fh1,StandardCharsets.UTF_8);
            Files.writeString(path2,fh2,StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        byte[] se1=new byte[1024];
        byte[] se2=new byte[1024];
        se1=xn.getBytes();
        se2=yn.getBytes();
        DatagramPacket send1 = new DatagramPacket(se1, se1.length, IPAddress, ports[0]);
        serverSocket.send(send1);
        DatagramPacket send2 = new DatagramPacket(se1, se1.length, IPAddress, ports[1]);
        serverSocket.send(send2);
        DatagramPacket send3 = new DatagramPacket(se2, se2.length, IPAddress, ports[2]);
        serverSocket.send(send3);
        DatagramPacket send4 = new DatagramPacket(se2, se2.length, IPAddress, ports[3]);
        serverSocket.send(send4);
        byte[] sendData = new byte[1024];
        sendData=res.getBytes();
        DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[0]);
        serverSocket.send(sendPacket1);
        DatagramPacket sendPacket2 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[1]);
        serverSocket.send(sendPacket2);
        DatagramPacket sendPacket3 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[2]);
        serverSocket.send(sendPacket3);
        DatagramPacket sendPacket4 = new DatagramPacket(sendData, sendData.length, IPAddress, ports[3]);
        serverSocket.send(sendPacket4);

    }
}

