package com.book.bookstoreapi.config;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Counter;

public class CustomMetrics {

    private final Counter bookCreationCounter;

    public CustomMetrics(MeterRegistry meterRegistry) {
        this.bookCreationCounter = meterRegistry.counter("book_creation_total");
    }

    public void incrementBookCreation() {
        bookCreationCounter.increment();
    }
}
