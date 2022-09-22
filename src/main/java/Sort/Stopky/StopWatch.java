package Sort.Stopky;

public class StopWatch {
	private Long start;
	private Long finish;

	public Long start() {
		return (start = System.currentTimeMillis());
	}

	public Long stop() {
        return (finish = System.currentTimeMillis());
    }

public double getTime(Long start, Long finish) {
	return finish - start/1000000000;
}
}
