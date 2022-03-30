import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;

public class UsahaBatuBata {
    public void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        
        boolean bool = true;

        LinkedList <String> stokKapur = new LinkedList<>();
        LinkedList <String> stokMerahInter = new  LinkedList<>();
        LinkedList <String> stokMerah = new  LinkedList<>();
        LinkedList <String> stokHebel = new  LinkedList<>();
        LinkedList <String> ambilKapur = new LinkedList<>();
        LinkedList <String> ambilMerahInter = new LinkedList<>();
        LinkedList <String> ambilMerah = new LinkedList<>();
        LinkedList <String> ambilHebel = new LinkedList<>();

        ArrayList <Integer> riwayat_beli = new ArrayList<Integer>();

        Queue <Integer> antrian = new LinkedList();

        Scanner pilih = new Scanner(System.in);

        do{ 
            System.out.println("");
            System.out.println("");
            System.out.println("====================== USAHA BATU BATA ======================");
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Jenis Bata yang Tersedia");
            System.out.println("2. Masukkan ID Pelanggan");
            System.out.println("3. Pembelian Batu Bata ");
            System.out.println("4. Tampilkan Antrian");
            System.out.println("5. Tampilkan Pesanan");
            System.out.println("6. Dequeue Pelanggan");
            System.out.println("7. Riwayat ID Pelanggan");
            System.out.println("8. SELESAI");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Masukkan Pilihan : ");
            int input = pilih.nextInt();
        

            switch(input) {
               
                case 1:
                Node root = new Node("Jenis Bata yang Tersedia : ");
                root.left = new Node(" \n Non Bakar ");
                System.out.println(" ");
                root.right = new Node(" \n Bakar ");
                System.out.println(" ");
                root.left.left = new Node(" { Bata Kapur Putih, ");
                System.out.println(" ");
                root.left.right = new Node(" Bata Merah Interlock} ");
                System.out.println(" ");
                root.right.left = new Node(" {Bata Merah, ");
                System.out.println(" ");
                root.right.right = new Node(" Bata Hebel} ");
                System.out.println(" ");
        
                        
                binaryTree treeOrder = new binaryTree();
                
                treeOrder.preOrder(root);
            

                class Node {
                    String data;
                    Node left;
                    Node right;
                    
                    Node(String string) {
                        data = string;
                        left = right = null;
                    }
                }
            
               
                stokKapur.add("1000");
                stokKapur.add("1000");
                stokKapur.add("1000");
                stokKapur.add("1000");
                stokKapur.add("1000");

                stokMerahInter.add("2000");
                stokMerahInter.add("2000");
                stokMerahInter.add("2000");
                stokMerahInter.add("2000");
                stokMerahInter.add("2000");

                stokMerah.add("5000");
                stokMerah.add("5000");
                stokMerah.add("5000");
                stokMerah.add("5000");
                stokMerah.add("5000");

                stokHebel.add("2000");
                stokHebel.add("2000");
                stokHebel.add("2000");
                stokHebel.add("2000");
                stokHebel.add("2000");
                

                System.out.println("\n\nStok Bata :");
                System.out.println("Batu bata kapur putih (1 Paket = 1000 Biji) \t : " + stokKapur);
                System.out.println("Batu bata merah interlock (1 Paket = 2000 Biji)  : " + stokMerahInter);
                System.out.println("Batu bata merah (1 Paket = 5000 Biji) \t\t : " + stokMerah);
                System.out.println("Batu bata hebel (1 Paket = 2000 Biji) \t\t : " + stokHebel);
        
                
                break;
                
                case 2:
                Scanner pilih1 = new Scanner(System.in);
                System.out.print("Masukkan ID Pelanggan : ");
                int input1 = pilih1.nextInt();
                antrian.add(input1);
                riwayat_beli.add(input1);
                break;

                case 3:
                Scanner pilih2 = new Scanner(System.in);
                System.out.println("1. Batu Bata Kapur Putih");
                System.out.println("2. Batu Bata Merah Interlock");
                System.out.println("3. Batu Bata Merah");
                System.out.println("4. Batu Bata Hebel");
                System.out.println("Masukkan pilihan : ");
                int input2 = pilih2.nextInt();
    
                    if (input2 == 1) {
                        System.out.println("\t1 Paket = 1000 biji");
                        ambilKapur.push(stokKapur.pop());
                        System.out.println("Kapur putih yang diambil : " + ambilKapur);
                        System.out.println("Sisa kapur putih : " + stokKapur + " Jumlah : " + stokKapur.size() + " paket");

                            

                    }else if (input2 == 2){
                        System.out.println("\t1 Paket = 2000 biji");
                        ambilMerahInter.push(stokMerahInter.pop());
                        System.out.println("Merah Interlock yang diambil : " + ambilMerahInter);
                        System.out.println("Sisa merah interlock : " + stokMerahInter + " Jumlah : " + stokMerahInter.size() + " paket");
        

                    }else if (input2 == 3){
                        System.out.println("\t1 Paket = 5000 biji");
                        ambilMerah.push(stokMerah.pop());
                        System.out.println("Merah yang diambil : " + ambilMerah);
                        System.out.println("Sisa merah : " + stokMerah + " Jumlah : " + stokMerah.size() + " paket");
                            

                    }else if (input2 == 4){
                        System.out.println("\t1 Paket = 2000 biji");
                        ambilHebel.push(stokHebel.pop());
                        System.out.println("Hebel yang diambil : " + ambilHebel);
                        System.out.println("Sisa Hebel : " + stokHebel + " Jumlah : " + stokHebel.size() + " paket");

                    }
                    
                break;

                
                case 4 :
                System.out.println("Antrian : " + antrian);
                System.out.println("");
                break;

                case 5 :
                System.out.println("Pesanan :");
                System.out.println("Batu Bata Kapur Putih\t : " + ambilKapur);
                System.out.println("Batu Bata Merah Interlock\t :" + ambilMerahInter);
                System.out.println("Batu Bata Merah\t :" + ambilMerah);
                System.out.println("Batu Bata Hebel\t :" + ambilHebel);
                break;

                
                case 6 :
                System.out.println("Terima Kasih Telah Berkunjung Pelanggan " + antrian.poll() + " ^_^");
                System.out.println("");
                break;

                case 7 :
                System.out.println(riwayat_beli);
                break;

                case 8 :
                System.exit(0);
                break;

                default:
                System.err.println("Pilihan tidak tersedia!");
                System.out.println("");

            }
        }
        while(bool);    

    }
    
}
