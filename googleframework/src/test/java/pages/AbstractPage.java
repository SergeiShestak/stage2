package pages;

public abstract class AbstractPage {
	protected abstract AbstractPage openPage();

	protected final int WAIT_TIMEOUT_SECONDS = 15;
}
