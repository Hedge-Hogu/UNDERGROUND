import java.io.*;

public class PipedReaderWiter {
	public static void main(String[] args) {
		InputThread  th1 = new InputThread("InputThread");
		OutputThread th2 = new OutputThread("OutputThread");
		
		th1.connect(th2.getOutput());
		
		th1.start();
		th2.start();
	}

}

class InputThread extends Thread {
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();

	public InputThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		
		while(true) {
			
			try {
				int data =0;
				
				while((data = input.read())!=-1) {
					sw.write(data);
				}
				System.out.println(getName()+" received : "+sw.toString());
				
			
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public PipedReader getInput() {
		return input;
	}
	
    public void connect(PipedWriter output) {
    	try {
			input.connect(output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}

class OutputThread extends Thread {
	PipedWriter output = new PipedWriter();

	public OutputThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				String msg = "Hello";
				System.out.println(getName()+" sent : "+msg);
				output.write(msg);
				output.close();
				
				
				
				
			} catch (IOException e) {
			}
			
		}
		
	}
	
	public PipedWriter getOutput() {
		return output;
	}
	
    public void connect(PipedReader input) {
    	try {
			output.connect(input);
		} catch (IOException e) {
		}
    }
	
}
