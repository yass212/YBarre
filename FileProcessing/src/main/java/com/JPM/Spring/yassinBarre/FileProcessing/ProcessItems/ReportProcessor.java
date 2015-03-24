package com.JPM.Spring.yassinBarre.FileProcessing.ProcessItems;

/*@Auther: Y Barre
 *@Date: 18/03/15*/

import org.springframework.batch.item.ItemProcessor;

import com.JPM.Spring.yassinBarre.FileProcessing.model.Item;

// processing the file before writing
public class ReportProcessor implements ItemProcessor<Item, Item> {

	/* code does not work yet , i'll work on it on my own time */

	@Override
	public Item process(Item item) throws Exception {

		double profit;
		int result = 0;

		if (item.getInstrument_type() == "Equity") {

			profit = (Double.parseDouble(item.getSell_price()) + Double
					.parseDouble(item.getBuy_price())) * item.getQuantity();
			item.setProfit(profit);

		} else if (item.getInstrument_type() == "Bond") {
			profit = item.getQuantity() * Double.parseDouble(item.getCoupon());
			item.setProfit(profit);

		}

		return item;

	}
}
