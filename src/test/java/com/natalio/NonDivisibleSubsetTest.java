package test.java.com.natalio;

import main.java.com.natalio.NonDivisibleSubset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class NonDivisibleSubsetTest {
    @Test
    public void aSetOfNonDivisibleBy3() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(7);
        l.add(2);
        l.add(4);
        int result = NonDivisibleSubset.calculate(l,3);
        assertTrue(3 == result);
    }
//
    @Test
    public void aSetOfNonDivisibleBy87() {
        List<Integer> l = new ArrayList<>(Arrays.asList(61197933, 56459859, 319018589, 271720536, 358582070, 849720202, 481165658, 675266245, 541667092, 615618805, 129027583, 755570852, 437001718, 86763458, 791564527, 163795318, 981341013, 516958303, 592324531, 611671866, 157795445, 718701842, 773810960, 72800260, 281252802, 404319361, 757224413, 682600363, 606641861, 986674925, 176725535, 256166138, 827035972, 124896145, 37969090, 136814243, 274957936, 980688849, 293456190, 141209943, 346065260, 550594766, 132159011, 491368651, 3772767, 131852400, 633124868, 148168785, 339205816, 705527969, 551343090, 824338597, 241776176, 286091680, 919941899, 728704934, 37548669, 513249437, 888944501, 239457900, 977532594, 140391002, 260004333, 911069927, 586821751, 113740158, 370372870, 97014913, 28011421, 489017248, 492953261, 73530695, 27277034, 570013262, 81306939, 519086053, 993680429, 599609256, 639477062, 677313848, 950497430, 672417749, 266140123, 601572332, 273157042, 777834449, 123586826));
        int result = NonDivisibleSubset.calculate(l,9);
        assertTrue(50 == result);
    }
//    @Test
//    public void aSetOfNonDivisibleBy3() {
//        Set<Integer> subset= NonDivisibleSubset.getSubset(3, new int[]{1, 7, 2, 4});
//        Integer[] result = subset.toArray(new Integer[subset.size()]);
//        Arrays.sort(result);
//        assertTrue(Arrays.equals(new Integer[]{1, 4, 7}, result));
//    }
}
