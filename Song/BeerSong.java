public class BeerSong {
  public static void main(String[] args) {
    int beerNum = 99;
    String word = "bottles";
    while (beerNum > 0) {
      System.out.print(beerNum + " " + word + " of beer on the wall, ");
      System.out.print(beerNum + " " + word + " of beer.");
      System.out.println("");
      System.out.print("Take one down. ");
      System.out.print("Pass it around. ");
      beerNum--;
      if (beerNum == 1) {
        word = "bottle";
      }
      if (beerNum > 0) {
        System.out.println(beerNum + " " + word + " of beer on the wall");
      } else {
        System.out.println("No more bottles of beer on the wall");
        System.out.println("");
        System.out.print("No more bottles of beer on the wall, ");
        System.out.print("no more bottles of beer. ");
        System.out.println("");
        System.out.print("Go to the store and buy some more. ");
        System.out.print("99 bottles of beer on the wall.");
      }
      System.out.println("");  
    }
  }

}
