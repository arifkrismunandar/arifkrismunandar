import java.util.Scanner;

public class Queue{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int menu=1,menu1=1,i=0,j=0;
		int panjang=0,enqueue,dequeue;
		System.out.print("Masukan panjang indeks : ");
			panjang=in.nextInt();
			int[]b=new int[panjang];
				while(menu1!=0){
						System.out.println("----Antrian Percetakan Digital----");
						System.out.println("0.Menu Sebelumnya");
						System.out.println("1.Enqueue");
						System.out.println("2.Dequeue");
						System.out.println("3.Check");
						System.out.println("4.Clear");
						System.out.println("---------------------------");
						System.out.print("Silahkan Pilih : ");
						menu1=in.nextInt();
						System.out.println("---------------------------");
						switch(menu1){
							case 1 :
							System.out.print("Berapa kali anda ingin enqueue data : ");
							enqueue=in.nextInt();
							int fenqueue=0;
							i=0;
							if(enqueue<=panjang&&enqueue>0){
								while(enqueue!=0){
									if(b[i]==0){
										enqueue--;
										fenqueue++;
										i++;
     										if(i==panjang)
											break;
									}
									else{
										i++;
										if(i==panjang)
											break;
									}
								}
								j=0;
								if(fenqueue==panjang){
									while(fenqueue!=0){
										b[j]=in.nextInt();
										j++;
										fenqueue--;
									}
								}
								else if(fenqueue==0){
									System.out.println("Queue Anda Penuh");
								}
								else{
									System.out.println("OVERFLOW");
									System.out.println("Silahkan Enqueue Data sebanyak "+fenqueue+"Kali");
									while(fenqueue!=0){
										if(b[j]==0){
											b[j]=in.nextInt();
											fenqueue--;
											j++;
										}
										else
											j++;
									}
								}
							}
							else
								System.out.println("Anda hanya bisa enqueue data maksimal sebanyak "+panjang+" kali");
						break;
						case 2 :
							System.out.print("Berapa kali anda ingin dequeue : ");
							dequeue=in.nextInt();
							System.out.println("Anda melakukan dequeue sebanyak "+dequeue+" kali");
							if(dequeue<=panjang&&dequeue>0){
								i=0;
								while(dequeue!=0){
									if(b[i]!=0){
										b[i]=0;
										dequeue--;
									}
									else{
										i++;
										if(i==panjang){
											if(dequeue>0){
												System.out.println("UNDERFLOW");
												break;
											}
											break;
										}
									}
								}
								//checking
								j=0;
								for(i=0;i<panjang;i++){
									if(b[i]!=0){
										b[j]=b[i];
										b[i]=0;
										j++;
									}			
								}
							}
							else{
								System.out.println("Anda hanya bisa mem-dequeue maksimal sebanyak "+panjang+" kali");
							}
						break;
						case 3:
							for(i=0;i<panjang;i++){
								System.out.println(b[i]);
							}
						break;
						case 4 :
							for(i=0;i<panjang;i++){
								b[i]=0;
							}
						break;	
						case 0 :
							System.out.println("Kembali ke menu utama");
						break;
						default : 
							System.out.println("Salah Input");
						break;
						}
					}
					System.out.println("Terimakasih telah menggunakan Aplikasi ini :) ");
					}
				}