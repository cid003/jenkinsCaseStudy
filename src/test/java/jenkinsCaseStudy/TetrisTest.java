package jenkinsCaseStudy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.psnbtech.Tetris;
import org.psnbtech.TileType;

public class TetrisTest {
	
	@Test
	public void testSpawnPiece() {
		TileType o = TileType.TypeO;
		Tetris testT = new Tetris();		

		do {
			testT.currentType = TileType.TypeO;
		}while(testT.getPieceType() != TileType.TypeO);
		
		assertEquals(testT.getPieceType(), o);
		
		return;
	}

}
