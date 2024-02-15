package com.encore.data.structor.list;

public class EncoreNodeList {

	private EncoreNode head ;
	
	public EncoreNodeList (int data) {
		this.head = new EncoreNode(data) ;
	}
	
	public void add(int data) {
		if(this.head == null) {
			// 연결 리스트 헤더가 생성되지 않은 상태!!
			this.head = new EncoreNode(data);
		}else {
			// 연결되어지는 노드를 생성
			EncoreNode node = this.head ;
			while(node.getNode() != null) {
				node = node.getNode();
			}
			node.setNode(new EncoreNode(data));
		}
	}
	
	public void desc() {
		EncoreNode node = this.head;
		while(node != null) {
			System.out.println("debug >>>> " + node.getData());
			node = node.getNode();
		}
	}
	
	public boolean remove(int data) {
//		System.out.println(this.head.getData());
//		deleting header
		if(this.head.getData() == data) {
			EncoreNode temp = this.head ;
			this.head = this.head.getNode();
			temp = null ;
		} else {
//		삭제해야할 데이터가 head가 아니고 중간이나 마지막 노드라면?
//		객체안의 객체가 노드 주소를 담고 있다 
			EncoreNode node = this.head ;
			while(node.getNode() != null) {
				if(node.getNode().getData() == data ) {
					
					EncoreNode temp = node.getNode() ;
					node.setNode(node.getNode().getNode());
					temp = null ;
					return true ;
					
				} else {
					node = node.getNode();
				}
			}
			
		}
		return false ;
		
	}
	
}
