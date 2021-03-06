/* Class: TPoint
 * -------------
 * This is just a trivial "struct" type class -- it simply holds 
 * an int x/y point for use by Tetris, and supports equals() and 
 * toString(). We'll allow public access to x/y, so this is not an 
 * object really.
 */

package tetris;

public class TPoint {
	public int x;
	public int y;

	/* Constructor: TPoint
	 * ------------------- 
	 * Creates a TPoint based in int x,y
	 */
	public TPoint(int x, int y) {
		// questionable style but convenient --
		// params with same name as ivars

		this.x = x;
		this.y = y;
	}

	/* Constructor: TPoint
	 * -------------------
	 * Creates a TPoint, copied from an existing TPoint
	 */
	public TPoint(TPoint point) {
		this.x = point.x;
		this.y = point.y;
	}

	/* Method: equals
	 * --------------
	 * Override to check if two TPoints are equal.
	 */
	@Override
	public boolean equals(Object other) {
		// standard two checks for equals()
		if (this == other) return true;
		if (!(other instanceof TPoint)) return false;

		// check if other point same as us
		TPoint pt = (TPoint)other;
		return(x==pt.x && y==pt.y);
	}

	/* Method: toString
	 * ----------------
	 * Converts a TPoint to a readable string form.
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
