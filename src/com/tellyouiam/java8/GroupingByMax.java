package com.tellyouiam.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByMax {
	public static void main(String[] args) {
		List<TrackworkTask> trackworkTasks = new ArrayList<TrackworkTask>();
		trackworkTasks.add(new TrackworkTask(2, new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime()));
		trackworkTasks.add(new TrackworkTask(2, new GregorianCalendar(2015, Calendar.JANUARY, 5).getTime()));
		trackworkTasks.add(new TrackworkTask(1, new Date()));
		trackworkTasks.add(null); //looxi
		
		Map<Date, TrackworkTask> lastCreatedTimeTrackWorkTask = trackworkTasks.stream().collect(Collectors.toMap(TrackworkTask::getCreatedDate, Function.identity()));
		//lastCreatedTimeTrackWorkTask.forEach((date,trackworkTask) -> System.out.println(date+" "+trackworkTask.getId()));
		Date date = Collections.max(lastCreatedTimeTrackWorkTask.keySet());
		System.out.println(date);
	}
}
