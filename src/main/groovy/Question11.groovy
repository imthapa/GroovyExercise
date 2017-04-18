/**
 11. Make copy of an image type file byte by byte
 */

file=new File("../../../imageCopy.jpg")
file.createNewFile()
file.setBytes(new File("../../../image/Ozil.jpg").getBytes())