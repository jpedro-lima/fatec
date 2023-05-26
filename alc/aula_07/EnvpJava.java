

package fatec.alc.aula_07;
import java.util.Map;

public class EnvpJava {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Map<String, String> envp = System.getenv();
		// for (int i = 0; i < envp.length; i++) {
		// 	System.out.println(envp[i]);
		// }
		for (String envName : envp.keySet()) {System.out.format("%s=%s%n", envName, envp.get(envName));}
    
	}	
}