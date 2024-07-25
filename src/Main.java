//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(9);
        System.out.println(tree.find(8));

        }
}