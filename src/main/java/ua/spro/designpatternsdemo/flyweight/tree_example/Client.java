package ua.spro.designpatternsdemo.flyweight.tree_example;

public class Client {
    public static void main(String[] args) {
        TreeManager treeManager = new TreeManager();

        for (int i = 0; i < 100; i++) {
            String treeType = (i % 2 == 0) ? "PineTree" : "OakTree";
            treeType = (i % 3 == 0) ? "MapleTree" : treeType;

            Tree tree = treeManager.getTree(treeType);
            tree.display((int) (Math.random() * 100), (int) (Math.random() * 100));
        }
        System.out.println(treeManager);
    }
}
