package Rekursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RekursionKtTest {
    Rekursion r = new Rekursion();
    List<String> uTomten = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader",
            "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen");
    List<String> uGlader = Arrays.asList("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten");
    List<String> uButter = Arrays.asList("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran",
            "Bladlusen");
    List<String> uTrötter = Arrays.asList("Dammråttan", "Skumtomten");
    List<String> uSkumtomten = Arrays.asList("Dammråttan");
    List<String> uRäven = Arrays.asList("Gråsuggan", "Myran", "Bladlusen");
    List<String> uMyran = Arrays.asList("Bladlusen");

    @Test
    public final void getUnderlingsMyranTest(){
        List<String> list = new ArrayList<>();
        List<String> underlings = r.getUnderlings("Myran",r.mapAvChefer(), list);
        assertEquals(underlings.size(), uMyran.size());
        assertFalse(underlings.retainAll(uMyran));
    }

    @Test
    public final void getUnderlingsRävenTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = r.getUnderlings("Räven",r.mapAvChefer(), list);
        assertEquals(underlings.size(), uRäven.size());
        assertFalse(underlings.retainAll(uRäven));
    }

    @Test
    public final void getUnderlingsSkumtomtenTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = r.getUnderlings("Skumtomten",r.mapAvChefer(), list);
        assertEquals(underlings.size(), uSkumtomten.size());
        assertFalse(underlings.retainAll(uSkumtomten));
    }

    @Test
    public final void getUnderlingsTrötterTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = r.getUnderlings("Trötter",r.mapAvChefer(), list);
        assertEquals(underlings.size(), uTrötter.size());
        assertFalse(underlings.retainAll(uTrötter));
    }


    @Test
    public final void getUnderlingsButterTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = r.getUnderlings("Butter",r.mapAvChefer(), list);
        assertEquals(underlings.size(), uButter.size());
        assertFalse(underlings.retainAll(uButter));
    }

    @Test
    public final void getUnderlingsGladerTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = r.getUnderlings("Glader",r.mapAvChefer(), list);
        assertEquals(underlings.size(), uGlader.size());
        assertFalse(underlings.retainAll(uGlader));
    }

    @Test
    public final void getUnderlingsTomtenTest(){
        List<String> list = new LinkedList<>();
        List<String> underlings = r.getUnderlings("Tomten",r.mapAvChefer(), list);
        assertEquals(underlings.size(), uTomten.size());
        assertFalse(underlings.retainAll(uTomten));
    }
}
