/*=============================================================================
|   Assignment:  Final Project - Multiple Document Summarization
|       Author:  Group7 - (Sampath, Ajay, Visesh)
|       Grader:  Walid Shalaby
|
|       Course:  ITCS 6190
|   Instructor:  Srinivas Akella
|
|     Language:  Java 
|     Version :  1.8.0_101
|                
| Deficiencies:  No logical errors.
*===========================================================================*/

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * Reducer class to combine all topic terms into a single file.
 * 
 */

public class CombineTopicsReducer extends Reducer<Text, Text, Text, Text> {
	@Override
	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
		int termFreq = 0;
		StringBuffer sb = new StringBuffer("");
		TextSummarizationDriver driverClass = new TextSummarizationDriver();
		for (Text value : values) {
			context.write(new Text(""), value);
		}
	}
}
