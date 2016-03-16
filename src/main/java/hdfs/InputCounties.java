package hdfs;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class InputCounties {

	public static void main(String[] args) throws IOException {
		FileSystem fs = FileSystem.get(new Configuration());
		Path counties = new Path("counties");
		for (int x = 1; x <= 4; x++) {
			String filename = "counties_" + x + ".csv";
			Path localSrc = new Path("counties/"+filename);
			fs.copyFromLocalFile(localSrc, localSrc);
			
			
		}
	}

}
