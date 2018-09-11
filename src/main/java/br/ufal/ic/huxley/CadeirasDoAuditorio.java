//Huxley problem 173
package br.ufal.ic.huxley;

public class CadeirasDoAuditorio {
    public static int numberChanges(int l, int c, int[][] chairs) {
        int aux = 1, auxCount = 0, position = -1, qtt = 0, temp;
        while(aux<(l*c)){
            for(int i = 0; i<l; i++){
                for(int j = 0; j<c; j++){
                    if(chairs[i][j] == aux && position == (-1)){
                        position = i;
                        i = auxCount;
                        j = 0;
                        if(position!= auxCount) qtt++;
                    }
                    if(position == auxCount) break;
                    if(i == auxCount && position != (-1)){
                        temp = chairs[i][j];
                        chairs[i][j] = chairs[position][j];
                        chairs[position][j] = temp;
                    }
                }
                if(position != -1) break;//verificar essa funcionalidade
            }
            position = -1;
            aux+=c;//primeiro valor de cada linha
            auxCount++;//onde aux deveria estar
        }
        //para ajeitar as colunas
        aux = 1;
        auxCount = 0;
        position = -1;
        while(aux<=c){
            for(int i = 0; i<l; i++){
                for(int j = 0; j<c; j++){
                    if(chairs[i][j] == aux && position == (-1)){
                        position = j;
                        j = auxCount;
                        if(position!= auxCount) qtt++;
                    }
                    if(position == auxCount) break;
                    if(j == auxCount && position != (-1)){
                        temp = chairs[i][j];
                        chairs[i][j] = chairs[i][position];
                        chairs[i][position] = temp;
                    }
                }
                if(position == auxCount) break;
            }
            position = -1;//posisao onde aux esta
            aux++;//primeiro valor de cada linha
            auxCount++;//onde aux deveria estar
        }

        return qtt;
    }
}
