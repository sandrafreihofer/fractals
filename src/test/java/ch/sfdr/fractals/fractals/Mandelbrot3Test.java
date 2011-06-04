package ch.sfdr.fractals.fractals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch.sfdr.fractals.math.ComplexNumber;


/**
 * Test for Mandelbrot^3 fractal
 * @author S.Freihofer
 */
public class Mandelbrot3Test
{
	private static final double TOL = 1.0e-5;

	private Mandelbrot3 me = new Mandelbrot3();

	@Test
	public void testGetLowerBounds()
	{
		ComplexNumber lowerBounds = me.getLowerBounds();
		assertEquals(-2, lowerBounds.getReal(), TOL);
		assertEquals(-2, lowerBounds.getImaginary(), TOL);
	}

	@Test
	public void testGetUpperBounds()
	{
		ComplexNumber upperBounds = me.getUpperBounds();
		assertEquals(2, upperBounds.getReal(), TOL);
		assertEquals(2, upperBounds.getImaginary(), TOL);
	}

	@Test
	public void testGetBoundarySqr()
	{
		assertEquals(4, me.getBoundarySqr(), TOL);
	}

	@Test
	public void testStep()
	{
		ComplexNumber start = new ComplexNumber(1.0, 2.0);
		ComplexNumber var = new ComplexNumber(2.0, 3.0);
		me.step(start, var);
		assertEquals(-45.0, var.getReal(), TOL);
		assertEquals(11.0, var.getImaginary(), TOL);
	}
}
