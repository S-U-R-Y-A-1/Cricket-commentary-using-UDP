import java.io.IOException;
import java.net.*;
import java.util.zip.CRC32;

public class newclass2 {
    public static void main(String args[]) throws Exception {
        int PORT = 12345;
        String SERVER_IP = "127.0.0.1";
        int BUFFER_SIZE = 1024;
        int k=1;
        int sc = 0;
        int wk = 0;
        //int kl;
        String com = "I am happy to welcome all the Titans present here!";
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
        System.out.print("Commentator Name : Danny Morrison\nCommentaries log :\n");

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
                    com = "The batting team is playing cautiously, accumulating runs between 5 to 11 without any casualties. They are laying a solid foundation, aiming to accelerate the scoring rate in the upcoming overs.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if (((sc > 5) && (sc <= 12)) && (wk == 1)) {
                    com =  "The batting team has lost an early wicket, but they have scored between 5 to 11 runs. The batsmen will need to rebuild the innings and ensure a steady partnership to steady the ship.";
                    sendData=com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if (((sc > 5) && (sc <= 12)) && (wk > 1)) {
                    com = "The batting side is under immense pressure. They've lost multiple wickets and have been unable to build a substantial score, scoring between 5 to 11 runs. The bowlers are relentless, not giving any breathing space to the batsmen.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;
                } else if ((sc <= 5) && (wk == 0)) {
                    com = "A slow start by the batting team as they score less than 5 runs without any casualties. The bowlers are applying early pressure, making it challenging for the batsmen to score freely.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc <= 5) && (wk == 1)) {
                    com = "A disappointing start for the batting team. They've lost a wicket while scoring less than 5 runs. The bowlers have struck early, and the batting side will have to dig deep to stabilize their innings and set a competitive target.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;


                } else if ((sc <= 5) && (wk > 1)) {
                    com =  "The bowling side is running riot! They've struck multiple times, and the batting team finds themselves in deep trouble, scoring less than 5 runs. The bowlers are relentless, maintaining tight control and not allowing the batsmen to settle.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk == 0)) {
                    com="A confident display by the batting side as they score more than 11 runs without losing any wickets. The batsmen are finding gaps and playing aggressive shots, putting the pressure back on the bowlers.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk == 1)) {
                    com="The batting team is making steady progress, scoring more than 11 runs despite losing a wicket. The partnership-building approach is paying off, and they are looking to set a challenging target.";
                    sendData = com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                } else if ((sc > 12) && (wk > 1)) {
                    com="The batting team has lost key wickets but continues to score runs. With more than 11 runs on the board, they'll need to rebuild their innings and stabilize their position against the resurgent bowling side.";                    sendData = com.getBytes();
                    sendData=com.getBytes();
                    DatagramPacket sendPacket1 = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                    clientSocket.send(sendPacket1);
                    ab[k]=com;

                }

            } else {
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
