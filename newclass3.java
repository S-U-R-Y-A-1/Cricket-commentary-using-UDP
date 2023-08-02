import java.io.IOException;
import java.net.*;
import java.util.zip.CRC32;

public class newclass3 {
    public static void main(String args[]) throws Exception {
        int PORT = 12345;
        String SERVER_IP = "127.0.0.1";
        int BUFFER_SIZE = 1024;
        int k=1;
        int sc = 0;
        int wk = 0;
        //int kl;
        String com = "Namaste Gujarat !,Welcoming you all to see the wrath of the titans";
        int portNumber = 9876;
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("localhost");

        while(k<2){
            byte[] sendData;
            CRC32 crc32 = new CRC32();

            sendData = com.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);
            k++;
            crc32.update(com.getBytes());
            long checksum = crc32.getValue();
            //System.out.println("CRC32 Checksum: " + checksum);

        }
        System.out.print("Commentator Name : Irfan Pathan\nCommentaries log :\n");
        String ab[]=new String[100];
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
                    com = "The bowlers have struggled to find breakthroughs against the batting side. The batsmen are capitalizing on loose deliveries, scoring consistently between 5 to 11 runs without losing any wickets.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;

                } else if (((sc > 5) && (sc <= 12)) && (wk == 1)) {
                    com = "A mixed bag for the batting team. They've lost a wicket but have managed to score between 5 to 11 runs. The new batsman will have to be watchful and support the set batsman to build a strong partnership.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;

                } else if (((sc > 5) && (sc <= 12)) && (wk > 1)) {
                    com = "The bowling side is on fire! They've taken quick wickets, leaving the batting team in tatters with a score between 5 to 11 runs. The batsmen need to dig deep and show resilience to stage a comeback.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;

                } else if ((sc <= 5) && (wk == 0)) {
                    com = "The bowling team has been impressive with their tight lines and lengths. The batting side has been kept quiet, scoring under 5 runs without losing any wickets. It's a cautious approach by the batsmen, trying to gauge the conditions before launching an attack.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;

                } else if ((sc <= 5) && (wk == 1)) {
                    com = "The bowling team strikes gold! They've claimed a wicket in the early exchanges, leaving the batting side with a tricky situation. The batsmen will have to rebuild the innings and show resilience to make a comeback.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;

                } else if ((sc <= 5) && (wk > 1)) {
                    com = "A nightmare start for the batting team. They've lost early wickets and have been unable to get the scoreboard moving. The bowling side has been exceptional, putting the batting team under immense pressure early in the game.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;

                } else if ((sc > 12) && (wk == 0)) {
                    com = "The bowlers are struggling to contain the batsmen. The batting side has scored more than 11 runs without any casualties, displaying excellent shot selection and dominating the early phase of the match.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;

                } else if ((sc > 12) && (wk == 1)) {
                    com = "A valuable wicket for the bowling side, but the batting team has crossed the 11-run mark. They'll need to consolidate their position and build another partnership to maintain the scoring rate.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;

                } else if ((sc > 12) && (wk > 1)) {
                    com = "A compelling contest between bat and ball! The batting team has managed to score more than 11 runs, but the bowling side has taken crucial wickets. The match hangs in the balance, and every run becomes crucial from this point forward.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k] = com;
                }

            } else {
                break;
            }
            System.out.print("\nCommentary : "+com);
            k++;
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
