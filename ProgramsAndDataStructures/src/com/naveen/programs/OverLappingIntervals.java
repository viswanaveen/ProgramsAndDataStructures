package com.naveen.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Intervals {
	int start;
	int end;

	Intervals() {
		start = 0;
		end = 0;
	}

	Intervals(int s, int e) {
		start = s;
		end = e;
	}

}

public class OverLappingIntervals {

	public List<Intervals> mergeIntervals(List<Intervals> intervals) {

		if (intervals.size() == 0 || intervals.size() == 1) {
			return intervals;
		}

		intervals.sort((Intervals obj1, Intervals obj2) -> obj1.start - obj2.start);

		Intervals firstInterval = intervals.get(0);
		int start = firstInterval.start;
		int end = firstInterval.end;
		List<Intervals> results = new ArrayList<>();

		for (int i = 1; i < intervals.size(); i++) {
			Intervals currentInterval = intervals.get(i);
			if (currentInterval.start <= end) {
				end = Math.max(currentInterval.end, end);
			} else {
				results.add(new Intervals(start, end));
				start = currentInterval.start;
				end = currentInterval.end;

			}

		}
		results.add(new Intervals(start, end));

		return results;
	}

	public static void main(String[] args) {
		OverLappingIntervals overLappingInterva = new OverLappingIntervals();
		List<Intervals> intervals = Arrays.asList(new Intervals(1, 3), new Intervals(2, 6), new Intervals(8, 10),
				new Intervals(15, 18));
		List<Intervals> result = overLappingInterva.mergeIntervals(intervals);
		result.forEach(r -> System.out.println(r.start + "," + r.end));

	}

}
