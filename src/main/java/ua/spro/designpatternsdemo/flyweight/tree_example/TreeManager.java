package ua.spro.designpatternsdemo.flyweight.tree_example;

import java.util.ArrayList;
import java.util.List;

public class TreeManager {
    private final List<Tree> trees = new ArrayList<>();

    public Tree getTree(String type){
        for (Tree tree : trees) {
          if(tree.getClass().getSimpleName().equals(type)){
              return tree;
          }
        }
        Tree newTree = createTree(type);
        trees.add(newTree);
        return newTree;
    }

    private Tree createTree(String type) {
        return switch (type) {
            case "PineTree" -> new PineTree();
            case "OakTree" -> new OakTree();
            case "MapleTree" -> new MapleTree();
            default -> throw new IllegalArgumentException("Unknown tree type: " + type);
        };
    }

    @Override
    public String toString() {
        return "TreeManager{" +
                "trees=" + trees +
                '}';
    }
}
