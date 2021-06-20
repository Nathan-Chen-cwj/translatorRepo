package cn.mtproject.mybatis.generator;

import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Description:</b><br>
 * 
 * @author <a href="www.mtproject.cn" target="_blank">Monty</a>
 * @version 1.0
 * @Note <b>ProjectName:</b> mybatis-generator <br>
 *       <b>PackageName:</b> net.seehope.util <br>
 *       <b>ClassName:</b> MybatisGenerator <br>
 *       <b>Date:</b> Jul 1, 2019 11:05:09 AM
 */
public class MybatisGenerator {
	public static void main(String[] args) {
		try {
			generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void generate() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(Resources.getResourceAsStream("mybatis-generator-config.xml"));
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		for (String warning : warnings) {
			System.out.println(warning);
		}
	}

	public static void generate(String configPath) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(Resources.getResourceAsStream(configPath));
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		for (String warning : warnings) {
			System.out.println(warning);
		}
	}
}
