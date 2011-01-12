package org.directmemory.storage;

import java.util.Formatter;

import org.directmemory.cache.CacheEntry;

public class HeapStorage extends Storage {

	public HeapStorage() {
		
	}
	
	public HeapStorage(int entriesLimit){
		super.entriesLimit = entriesLimit;
	}

	@Override
	protected boolean moveIn(CacheEntry entry) {
		return true;
	}

	@Override
	public boolean moveToHeap(CacheEntry entry) {
		return true;
	}
	@Override
	public String toString() {
		return new Formatter()
					.format(
							"Heap: entries %1d/%2d", 
							entries.size(), 
							entriesLimit)
					.toString();
	}
}