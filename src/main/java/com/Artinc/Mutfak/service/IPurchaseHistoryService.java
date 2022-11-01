package com.Artinc.Mutfak.service;

import com.Artinc.Mutfak.model.PurchaseHistory;
import com.Artinc.Mutfak.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
