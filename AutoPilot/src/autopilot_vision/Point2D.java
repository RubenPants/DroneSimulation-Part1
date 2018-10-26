package autopilot_vision;

/**
 * A class representing a point in 2-dimensional Euclidian space, having an x and an y coordinate.
 * 
 * @author Team Saffier
 * @version 1.0
 */
public class Point2D {

	/**
	 * Initialize a new point with given x and given y coordinates.
	 * 
	 * @param  	x
	 *		   	The x coordinate for this new point.
	 * @param  	y
	 *		   	The y coordinate for this new point.
	 * @post   	The x coordinate of this new point is equal to
	 *		   	the given x coordinate.
	 *       	| new.getX() == x
	 * @post   	The y coordinate of this new point is equal to
	 *		   	the given y coordinate.
	 *       	| new.getY() == y
	 */
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Return the x coordinate of this point.
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Variable registering the x coordinate of this point.
	 */
	private double x;

	/**
	 * Return the y coordinate of this point.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Variable registering the y coordinate of this point.
	 */
	private double y;
	
	/**
	 * Calculates the Euclidian distance between this point and the given one.
	 * 
	 * @param 	other
	 * 			The point to calculate the distance from.
	 * @return	The Euclidian distance between this - and the given point.
	 * @note		The distance is not calculated using the classical sqrt(dx^2+dy^2) equation as to prevent overflow.
	 */
	public double distanceTo(Point2D other) {
		double dx = Math.abs(this.getX() - other.getX()), dy = Math.abs(this.getY() - other.getY());
		double min = Math.min(dx, dy), max = Math.max(dx, dy);
		if (max == 0)
			return 0;
		double r = min / max;
		return max * Math.sqrt(1 + r*r);
	}
	
	/**
	 * Returns a string representation of this point.
	 * 
	 * @return 	A string representing this point.
	 * 			| result == "[" + this.getX() + " " + this.getY() + "]"
	 */
	public String toString() {
		return "[" + this.getX() + " " + this.getY() + "]";
	}
	
	/**
	 * Check if two points are equal.
	 * 
	 * @param 	other
	 * 			The other point that is compared with this point.
	 * @return	Whether both x- and y-coordinates are equal.
	 * 			| this.getX() == other.getX() && this.getY() == other.getY()
	 */
	public boolean equalsTo(Point2D other) {
		return (this.getX() == other.getX() && this.getY() == other.getY());
	}

}