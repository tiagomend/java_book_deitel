package ch12.fig12_23;

public class ListTest {
    public static void main(String[] args) {
        ListFrame listFrame = new ListFrame(); // cria o frame da lista
        listFrame.setDefaultCloseOperation(ListFrame.EXIT_ON_CLOSE); // encerra o programa ao fechar
        listFrame.setSize(350, 200); // define o tamanho do frame
        listFrame.setVisible(true); // torna o frame visível
    }
}
