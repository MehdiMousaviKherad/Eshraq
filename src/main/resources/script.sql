CREATE View view select Store.name , Store.phone ,Store.address,Goods.name,Goods.price,Goods.isenable ,Goods_Store.count from Store,Goods,Goods_Store;