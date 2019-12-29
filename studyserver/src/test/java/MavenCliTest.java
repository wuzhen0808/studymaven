import org.apache.maven.cli.CliRequest;
import org.apache.maven.cli.MavenCli;
import org.junit.Test;

public class MavenCliTest {

    @Test
    public void test(){
        MavenCli mavenCli = new MavenCli();
        MavenCli.main(new String[]{});

    }

}
