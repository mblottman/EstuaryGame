package RecycleGameScreenItem;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

import screenItems.RecycleGameScreenItems.AppleCore;
import screenItems.RecycleGameScreenItems.Arrow;
import screenItems.RecycleGameScreenItems.BananaPeel;
import screenItems.RecycleGameScreenItems.ChipBag;
import screenItems.RecycleGameScreenItems.DiscardItems;
import screenItems.RecycleGameScreenItems.GlassBottle;
import screenItems.RecycleGameScreenItems.Newspaper;
import screenItems.RecycleGameScreenItems.Recyclable;
import screenItems.RecycleGameScreenItems.RecycleBin;
import screenItems.RecycleGameScreenItems.TinCan;
import screenItems.RecycleGameScreenItems.Trash;
import screenItems.RecycleGameScreenItems.TrashBin;
import junit.framework.TestCase;
/**
 * test all the subclasses of RecycleGameScreenItem
 * @author wenyiyin
 *
 */
public class RecycleGameTestSI extends TestCase{
	public void testAppleCore(){
		AppleCore appleCore = new AppleCore(2, 3);
		
		assertEquals(2,appleCore.getxPos());
		assertEquals(3,appleCore.getyPos());
		appleCore.setxPos(8);
		appleCore.setyPos(10);
		assertEquals(8,appleCore.getxPos());
		assertEquals(10,appleCore.getyPos());
		
		appleCore.hashCode();
	}
	
	public void testArrow(){
		Arrow arrow = new Arrow(0, 0, 0);
		
		assertEquals(0,arrow.getxPos());
		assertEquals(0,arrow.getyPos());
		assertEquals(0.0,arrow.getOrientation());
		arrow.setxPos(8);
		arrow.setyPos(10);
		arrow.setOrientation(2.0);
		assertEquals(8,arrow.getxPos());
		assertEquals(10,arrow.getyPos());
		assertEquals(2.0,arrow.getOrientation());
		
		arrow.moveArrow();
		arrow.hashCode();
	}
	
	public void testBananaPeel(){
		BananaPeel bananaPeel = new BananaPeel(0, 0);
		
		assertEquals(0,bananaPeel.getxPos());
		assertEquals(0,bananaPeel.getyPos());
		bananaPeel.setxPos(8);
		bananaPeel.setyPos(10);
		assertEquals(8,bananaPeel.getxPos());
		assertEquals(10,bananaPeel.getyPos());
		
		bananaPeel.hashCode();
	}
	
	public void testChipBag(){
		ChipBag chipBag = new ChipBag(0, 0);
		
		assertEquals(0,chipBag.getxPos());
		assertEquals(0,chipBag.getyPos());
		chipBag.setxPos(8);
		chipBag.setyPos(10);
		assertEquals(8,chipBag.getxPos());
		assertEquals(10,chipBag.getyPos());
		
		chipBag.hashCode();
	}
	
	public void testGlassBottle(){
		GlassBottle glassBottle = new GlassBottle(0, 0);
		
		assertEquals(0,glassBottle.getxPos());
		assertEquals(0,glassBottle.getyPos());
		glassBottle.setxPos(8);
		glassBottle.setyPos(10);
		assertEquals(8,glassBottle.getxPos());
		assertEquals(10,glassBottle.getyPos());
		
		glassBottle.hashCode();
	}
	
	public void testNewspaper(){
		Newspaper newspaper = new Newspaper(0, 0);
		
		assertEquals(0,newspaper.getxPos());
		assertEquals(0,newspaper.getyPos());
		newspaper.setxPos(8);
		newspaper.setyPos(10);
		assertEquals(8,newspaper.getxPos());
		assertEquals(10,newspaper.getyPos());
		
		newspaper.hashCode();
	}
	
	public void testTinCan(){
		TinCan tinCan = new TinCan(0, 0);
		
		assertEquals(0,tinCan.getxPos());
		assertEquals(0,tinCan.getyPos());
		tinCan.setxPos(8);
		tinCan.setyPos(10);
		assertEquals(8,tinCan.getxPos());
		assertEquals(10,tinCan.getyPos());
		
		tinCan.hashCode();
	}
	
	public void testTrashBin(){
		TrashBin trashBin = new TrashBin(0, 0);
		
		assertEquals(0,trashBin.getxPos());
		assertEquals(0,trashBin.getyPos());
		trashBin.setxPos(8);
		trashBin.setyPos(10);
		assertEquals(8,trashBin.getxPos());
		assertEquals(10,trashBin.getyPos());
		
		trashBin.hashCode();
	}
	
	public void testRecyclable(){
		Recyclable recyclable = new Recyclable(0, 0);
		
		assertEquals(0,recyclable.getxPos());
		assertEquals(0,recyclable.getyPos());
		recyclable.setxPos(8);
		recyclable.setyPos(10);
		assertEquals(8,recyclable.getxPos());
		assertEquals(10,recyclable.getyPos());
	}
	
	public void testTrash(){
		Trash trash = new Trash(0, 0);
		
		assertEquals(0,trash.getxPos());
		assertEquals(0,trash.getyPos());
		trash.setxPos(8);
		trash.setyPos(10);
		assertEquals(8,trash.getxPos());
		assertEquals(10,trash.getyPos());
	}
	
	public void testRecycleBin(){
		RecycleBin recycleBin = new RecycleBin(0, 0);
		
		assertEquals(0,recycleBin.getxPos());
		assertEquals(0,recycleBin.getyPos());
		recycleBin.setxPos(8);
		recycleBin.setyPos(10);
		assertEquals(8,recycleBin.getxPos());
		assertEquals(10,recycleBin.getyPos());
		
		recycleBin.hashCode();
	}
	
	public void testDiscardItems(){
		DiscardItems discardItems = new DiscardItems(0, 0);
		
		assertEquals(0,discardItems.getxPos());
		assertEquals(0,discardItems.getyPos());
		discardItems.setxPos(8);
		discardItems.setyPos(10);
		assertEquals(8,discardItems.getxPos());
		assertEquals(10,discardItems.getyPos());
		
		discardItems.setRecyclable(true);
		boolean isRecyclable = discardItems.getIsRecyclable();
		assertEquals(isRecyclable, true);
		
		discardItems.setThrown(true);
		boolean isThrown = discardItems.getIsThrown();
		assertEquals(isThrown, true);
		
		discardItems.setName("AppleCore");
		String name = discardItems.getName();
		assertEquals(name, "AppleCore");
		
		discardItems.checkBin();
		discardItems.updatePos();
		discardItems.render(new Graphics2D(){

			@Override
			public void draw(Shape s) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean drawImage(Image img, AffineTransform xform,
					ImageObserver obs) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void drawImage(BufferedImage img, BufferedImageOp op, int x,
					int y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawRenderedImage(RenderedImage img,
					AffineTransform xform) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawRenderableImage(RenderableImage img,
					AffineTransform xform) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawString(String str, int x, int y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawString(String str, float x, float y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawString(AttributedCharacterIterator iterator, int x,
					int y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawString(AttributedCharacterIterator iterator,
					float x, float y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawGlyphVector(GlyphVector g, float x, float y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fill(Shape s) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public GraphicsConfiguration getDeviceConfiguration() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setComposite(Composite comp) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setPaint(Paint paint) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setStroke(Stroke s) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setRenderingHint(Key hintKey, Object hintValue) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getRenderingHint(Key hintKey) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setRenderingHints(Map<?, ?> hints) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addRenderingHints(Map<?, ?> hints) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public RenderingHints getRenderingHints() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void translate(int x, int y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void translate(double tx, double ty) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void rotate(double theta) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void rotate(double theta, double x, double y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void scale(double sx, double sy) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void shear(double shx, double shy) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void transform(AffineTransform Tx) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setTransform(AffineTransform Tx) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public AffineTransform getTransform() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Paint getPaint() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Composite getComposite() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setBackground(Color color) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Color getBackground() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Stroke getStroke() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void clip(Shape s) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public FontRenderContext getFontRenderContext() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Graphics create() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Color getColor() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setColor(Color c) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setPaintMode() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setXORMode(Color c1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Font getFont() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setFont(Font font) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public FontMetrics getFontMetrics(Font f) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Rectangle getClipBounds() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void clipRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setClip(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Shape getClip() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setClip(Shape clip) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void copyArea(int x, int y, int width, int height, int dx,
					int dy) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawLine(int x1, int y1, int x2, int y2) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fillRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void clearRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawRoundRect(int x, int y, int width, int height,
					int arcWidth, int arcHeight) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fillRoundRect(int x, int y, int width, int height,
					int arcWidth, int arcHeight) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawOval(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fillOval(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawArc(int x, int y, int width, int height,
					int startAngle, int arcAngle) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fillArc(int x, int y, int width, int height,
					int startAngle, int arcAngle) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean drawImage(Image img, int x, int y,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int x, int y, int width,
					int height, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int x, int y, Color bgcolor,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int x, int y, int width,
					int height, Color bgcolor, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int dx1, int dy1, int dx2,
					int dy2, int sx1, int sy1, int sx2, int sy2,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int dx1, int dy1, int dx2,
					int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
}
