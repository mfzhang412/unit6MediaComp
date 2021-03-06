/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
    }
    
  public static void testMirrorHorizontal()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
    }
    
  public static void testMirrorHorizontalBotToTop()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontalBotToTop();
      caterpillar.explore();
    }
    
  public static void testMirrorArm()
  {
      Picture snowman = new Picture("snowman.jpg");
      snowman.explore();
      snowman.mirrorArm();
      snowman.explore();
    }
    
  public static void testMirrorGull()
  {
      Picture seagull = new Picture("seagull.jpg");
      seagull.explore();
      seagull.mirrorGull();
      seagull.explore();
    }
    
  public static void testCopyAndCrop()
  {
      Picture seagull = new Picture("seagull.jpg");
      Picture snowman = new Picture("snowman.jpg");
      
      snowman.explore();
      snowman.copyAndCrop(seagull, 229, 323, 235, 350, 50, 100);
      snowman.explore();
    }
    
  public static void testScaleBySix()
  {
      Picture bridge = new Picture("bridge.jpg");
      bridge = bridge.scaleBySix();
      bridge.write("scaledBridge.jpg");
      
      Picture newBridge = new Picture("scaledBridge.jpg");
      newBridge.explore();
    }
    
  public static void testKeepOnlyRed()
  {
      Picture bridge = new Picture("bridge.jpg");
      bridge = bridge.scaleBySix();
      
      bridge.keepOnlyRed();
      bridge.explore();
    }
    
  public static void testGrayScale()
  {
      Picture bridge = new Picture("bridge.jpg");
      bridge = bridge.scaleBySix();
      
      bridge.grayScale();
      bridge.explore();
    }
    
  public static void testInvert()
  {
      Picture bridge = new Picture("bridge.jpg");
      bridge = bridge.scaleBySix();
      
      bridge.invert();
      bridge.explore();
    }
    
  public static void testCreateCollage()
  {
      Picture collage = new Picture(768, 1024);

      collage.createCollage();
      collage.explore();
    }
    
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorArm();
    //testMirrorGull();
    //testCopyAndCrop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testScaleBySix();
    testCreateCollage();
  }
}