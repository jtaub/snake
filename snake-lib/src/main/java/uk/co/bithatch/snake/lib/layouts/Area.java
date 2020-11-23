package uk.co.bithatch.snake.lib.layouts;

import uk.co.bithatch.snake.lib.Region;

public class Area extends AbstractIO  implements RegionIO {

	private Region.Name region;

	public Region.Name getRegion() {
		return region;
	}

	public void setRegion(Region.Name region) {
		this.region = region;
		fireChanged();
	}
}
