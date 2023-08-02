import java.io.IOException;
import java.net.*;
import java.util.*;
import java.util.zip.CRC32;

public class newclass {
    public static void main(String args[]) throws Exception {
        int PORT = 12345;
        String SERVER_IP = "127.0.0.1";
        int BUFFER_SIZE = 1024;
        int k=1;
        int sc = 0;
        int wk = 0;
        //int kl;
        String com = "Good evening, Chennai !";
        int portNumber = 9876;
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("localhost");

        //System.out.print(IPAddress);
        while(k<2){
            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];
            CRC32 crc32 = new CRC32();

            sendData = com.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);
            k++;
            crc32.update(com.getBytes());
            long checksum = crc32.getValue();
            System.out.println("\nCRC32 Checksum: " + checksum+'\n');


        }
        String ab[]=new String[100];
        System.out.print("Commentator Name : Harsha Bhogle\nCommentaries log :\n");
        k=0;
        while(true) {
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String serverInput = new String(receivePacket.getData(), 0, receivePacket.getLength());
            String[] parts = serverInput.split("/");

            // Continue processing or responding to other client requests concurrently
            int i = 0;
            for (String part : parts) {
                //System.out.println(part);
                int number = Integer.parseInt(part);
                if (i == 0)
                    sc = number;
                else
                    wk = number;
                i++;

                // Print the converted integer
                //System.out.println(sc);
            }
            if (sc != 999) {
                if (((sc > 5) && (sc <= 12)) && (wk == 0)) {
                    com = "Excellent performance by the batting side. They're looking forward to improve their run rate while keeping the wickets in hands.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if (((sc > 5) && (sc <= 12)) && (wk == 1)) {
                    com = "A breakthrough for the bowling side! The batting team has scored between 5 to 11 runs but has lost a crucial wicket. They need to consolidate their position and build a partnership.";
                    sendData=com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if (((sc > 5) && (sc <= 12)) && (wk > 1)) {
                    com = "The bowling side is on fire! The batting team has lost more than one wicket while scoring between 5 to 11 runs. It's a challenging situation for them as they aim to stabilize their innings.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc <= 5) && (wk == 0)) {
                    com = "The batting team is off to a cautious start, scoring less than 5 runs without losing any wickets. They're focusing on building a solid foundation and avoiding early setbacks.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc <= 5) && (wk == 1)) {
                    com = "An early breakthrough for the bowling team! The batting team has scored less than 5 runs and has already lost a wicket. They'll need to regroup and stabilize their innings.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc <= 5) && (wk > 1)) {
                    com = "Disastrous start for the batting team! They've lost more than one wicket with less than 5 runs on the board. The bowling side is dominating the early exchanges, and the batting team will have to stage a recovery.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk == 0)) {
                    com = "The batting team is off to a flying start! They've scored more than 11 runs without losing any wickets. The batsmen are displaying aggression and putting pressure on the opposition.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk == 1)) {
                    com = "A breakthrough for the bowling side, but the batting team has managed to score more than 11 runs. They're building a solid platform despite the loss of a wicket.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk > 1)) {
                    com =  "The bowling side is making a comeback! Although the batting team has scored more than 11 runs, they've lost multiple wickets. The bowlers have managed to create some pressure and are looking to take control of the game.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;
                }

            }  else {
                break;
            }
            System.out.print("\nCommentary : "+com);
            com="";
        }
        int x=0;
        System.out.print("\n\n======================INNINGS REPORT====================================\n");
        while(x<2){
            byte[] receiveData=new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String serverInput = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.print(serverInput);
            System.out.print("\n\n==========================================================================\n\n");
            x+=1;
        }

    }
        }
