package karate.booking;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static karate.booking.utils.ConstantString.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParallel {
    @Test
    void testParallel() {
        Results results = Runner.path(CLASS_PATH_FEATURES).outputCucumberJson(TRUE).tags(IGNORE).parallel(ONE);
        generateReport(results.getReportDir());
        assertEquals(ZERO, results.getFailCount(), results.getErrorMessages());
    }

    public static void generateReport(String karateOutputPath){
        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[]{JSON}, TRUE);
        List<String> jsonPaths = new ArrayList<>(jsonFiles.size());
        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
        Configuration config = new Configuration(new File(BUILD), PROJECT_NAME);
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }


}
