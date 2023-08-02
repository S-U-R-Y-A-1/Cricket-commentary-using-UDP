import java.io.IOException;
import java.net.*;
import java.util.zip.CRC32;

public class newclass1 {
    public static void main(String args[]) throws Exception {
        int PORT = 12345;
        String SERVER_IP = "127.0.0.1";
        int BUFFER_SIZE = 1024;
        int k=1;
        int sc = 0;
        int wk = 0;
        //int kl;
        String com = "Vanakkam, Chennai !.Nice to meet you all";
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("localhost");


        while(k<2){
            byte[] sendData;
            byte[] receiveData = new byte[1024];
            sendData = com.getBytes();
            CRC32 crc32 = new CRC32();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);
            k++;
            crc32.update(com.getBytes());
            long checksum = crc32.getValue();
            //System.out.println("CRC32 Checksum: " + checksum);

        }
        System.out.print("Commentator Name : Sunil Gavaskar\nCommentaries log :\n");
        k=0;
        String ab[]=new String[100];
        while(true) {
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String serverInput = new String(receivePacket.getData(), 0, receivePacket.getLength());
            String[] parts = serverInput.split("/");

            // Continue processing or responding to other client requests concurrently
            int i = 0;
            int a[] = new int[2];
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
                    com="A steady start by the batting team, scoring between 5 to 11 runs without losing any wickets. The batsmen are looking settled and are gradually building a platform for the big-hitters to follow.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if (((sc > 5) && (sc <= 12)) && (wk == 1)) {
                    com="A vital breakthrough for the bowling team! The batting side has lost a wicket, but they have managed to score between 5 to 11 runs. The incoming batsman will need to settle in quickly and keep the momentum going.";
                    sendData=com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if (((sc > 5) && (sc <= 12)) && (wk > 1)) {
                    com="The bowling team is dominating the game! They've taken multiple wickets while restricting the batting team to a score between 5 to 11 runs. The batsmen are struggling to cope with the disciplined bowling attack." ;
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc <= 5) && (wk == 0)) {
                    com="The batting team is struggling to find their footing in the early stages of the match. With less than 5 runs on the board and no wickets lost, they'll need to be cautious and start building partnerships to stabilize their innings.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc <= 5) && (wk == 1)) {
                    com="An early breakthrough for the bowling side! The batting team has lost a wicket early on while struggling to score runs. They'll need to regroup quickly and build a partnership to recover from this early setback." ;
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;


                } else if ((sc <= 5) && (wk > 1)) {
                    com="What a remarkable start by the bowling team! They have dismantled the batting side with quick wickets, leaving them struggling with less than 5 runs on the board. The bowlers are on top, and the batting team has a massive challenge ahead.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk == 0)) {
                    com="The batting team is off to a blazing start! Scoring more than 11 runs without losing any wickets, the batsmen are taking control of the game and setting a strong foundation for a big total.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk == 1)) {
                    com="A breakthrough for the bowling side, but the batting team continues to score runs. They've managed to surpass the 11-run mark with the loss of a wicket. The incoming batsman will aim to continue the momentum.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk > 1)) {
                    com="The bowling team is making a strong comeback! Although the batting side has scored more than 11 runs, they've lost multiple wickets. The bowlers are tightening the screws, creating pressure on the incoming batsmen.";                    sendData = com.getBytes();
                    sendData=com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;
                }

            }else {
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
