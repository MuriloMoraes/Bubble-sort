
public class bubble
{
   public static void main(String args[]){
    int[] vet = {10, 8, 4, 5, 1};
    int aux = 0;
    
    for(int i = 0; i<5; i++){
        for(int j = 0; j<4; j++){
            if(vet[j] > vet[j + 1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
            }
        }
    }
    System.out.println("O vetor está ordenado");
    for(int i = 0; i<5; i++){
        System.out.println(" "+vet[i]);
    }
}
}
