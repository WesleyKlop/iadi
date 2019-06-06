package io.wesley.iadi;

class Boom {

    public static void main(String[] args) {
        // Generic class Parameterized with String
        BKnoop<String> aap = new BKnoop<>("aap");

        BKnoop<String> noot = new BKnoop<>("noot");
        BKnoop<String> mies = new BKnoop<>("mies");
        aap.add(noot);
        aap.add(mies);
        noot.add(new BKnoop<>("Wim"));
        noot.add(new BKnoop<>("Jet"));

        System.out.print("PRE : ");
        aap.printPreOrder(aap);
        System.out.print("\nPOST: ");
        aap.printPostOrder(aap);
        System.out.print("\nIN  : ");
        aap.printInOrder(aap);

        System.out.println("\n Aantal knopen : " + aap.aantalKnopen());
        System.out.println("\n Aantal leafs : " + aap.aantalLeafs());


    }


}
