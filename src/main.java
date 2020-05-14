import java.util.Scanner;

class main {

    public static void main(String[] args)
    {

        Scanner myObj = new Scanner(System.in);
        String Michi [][] = new String[3][3];
        for (int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                Michi[i][j] = "-";
            }
        }

        for (int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                System.out.print(Michi[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }
        int ganador = 0;
        String turno = "x";
        int x;
        int y;
        int contador = 0;
        
        while (ganador == 0 && contador<9){
            do {
                System.out.print("Ingrese coordenada x: ");
                x = myObj.nextInt();
                System.out.println();
                System.out.print("Ingrese coordenada y: ");
                y = myObj.nextInt();
                System.out.println();
            }while (!Michi[x][y].equals("-"));
            Michi[x][y] = turno;
            contador ++;
            if(turno.equals("x")){
                turno = "O";
            }else{
                turno = "x";
            }

            for (int a = 0; a < 8; a++) {
                String line = null;
                switch (a) {
                    case 0:
                        line = Michi[0][0] + Michi[1][1] + Michi[2][2];
                        break;
                    case 1:
                        line = Michi[0][2] + Michi[1][1] + Michi[2][0];
                        break;
                    case 2:
                        line = Michi[0][0] + Michi[0][1] + Michi[0][2];
                        break;
                    case 3:
                        line = Michi[1][0] + Michi[1][1] + Michi[1][2];
                        break;
                    case 4:
                        line = Michi[2][0] + Michi[2][1] + Michi[2][2];
                        break;
                    case 5:
                        line = Michi[0][0] + Michi[1][0] + Michi[2][0];
                        break;
                    case 6:
                        line = Michi[0][1] + Michi[1][1] + Michi[2][1];
                        break;
                    case 7:
                        line = Michi[0][2] + Michi[1][2] + Michi[2][2];
                        break;
                }
                if (line.equals("xxx")) {
                    ganador = 1;
                } else if (line.equals("OOO")) {
                    ganador = 2;
                }
            }
            for (int i = 0; i<3;i++){
                for(int j = 0; j<3;j++){
                    System.out.print(Michi[i][j]);
                    System.out.print(" ");
                }
                System.out.println("\n");

            }
            
        }if(contador < 9){
            System.out.print("Ganador jugador: ");
            System.out.println(ganador);
        }else{
        System.out.print("Empate");
        }

    }

}
