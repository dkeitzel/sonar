package de.ba.sea.spu;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import de.ba.sea.spu.modula.Calculator;

public class AppTest {

    @Test
    public void testApp() {
        final Calculator calculator = new Calculator();
        assertThat(calculator.multiply(2, 2), is(4));
    }
}
