package jenkinsCaseStudy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.psnbtech.Tetris;
import org.psnbtech.TileType;

public class TetrisTest {

	@Test
	public void testSpawnPiece() {
		TileType o = TileType.TypeO;
		int count = 0;
		
		Tetris testT = new Tetris();		
		do {
			count++;
			testT.spawnPiece();
		}while((testT.getPieceType() != TileType.TypeO) || (count != 700000));
		
		assertEquals(testT.getPieceType(), o);
	}

}
