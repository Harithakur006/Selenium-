package MyMavenAssignment;
import static us.abstracta.jmeter.javadsl.JmeterDsl.*;

import us.abstracta.jmeter.javadsl.core.TestPlanStats;

 import MyMavenAssignment.*;

import static us.abstracta.jmeter.javadsl.JmeterDsl.*;

import us.abstracta.jmeter.javadsl.core.TestPlanStats;

public class OpenCartLoadTest {

    public static void main(String[] args) throws Exception {
        TestPlanStats stats = testPlan(
            threadGroup(100, 30, // 100 users over 30 seconds
                httpSampler("https://www.opencart.com/")
            )
        ).run();

        System.out.println("Avg response time: " + stats.overall().sampleTime().mean());
        System.out.println("Success rate: " + stats.overall().samples());
    }
}

