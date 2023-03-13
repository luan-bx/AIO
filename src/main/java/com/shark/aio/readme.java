package com.shark.aio;

public class readme {
	/**
	 * 现阶段任务：
	 *		污染源监控：
	 *				1、顶部导航栏按监控点分类
	 *				2、增加时间选择，查看时间段内数据
	 *				3、数采仪连接的传感器数量和字段均不确定，表格的类别可将数据的name提取保存数据库，再发给前端
	 *				4、新增数采仪，将其id号与监测点捆绑，前端做分页，按监测点分页
	 *				5、若数据缺少其中一个字段报错，如何处理（工况监控同），或者每次的数据包字段数量可能不一样
	 */
	/**
	 * 
	 * base:启动 
	 * information:园区/企业信息 
	 * data：污染源监控 
	 * workingCondition:工况监控
	 * video：视频监控（人员识别、车牌识别） 
	 * alarm：报警管理 
	 * upload:数据上传 
	 * trace：溯源分析 
	 * file:文件管理 
	 * system:系统管理
	 * user：用户表（登录、注册）
	 */

	/**
	 * # AIO
	 * 可视化面板
	 * <li><a th:href="@{/index}"></i> 可视化面板 </a></li>
	 * 数据监测
	 * <li><a th:href="@{/pollutionMonitor}"> 污染源监测 </a></li>
	 * <li><a th:href="@{/conditionMonitor}"> 工况监测 </a></li>
	 * <li><a th:href="@{/videoMonitor}"> 视频监测 </a></li>
	 * 智慧预警
	 * <li><a th:href="@{/alarm/record}"> 告警通知 </a></li>
	 * <li><a th:href="@{/alarm/settings}"> 预警设置 </a></li>
	 * 运营管理
	 * <li><a th:href="@{/announcement}">园区公告</a></li>
	 * <li><a th:href="@{/dataReport}">数据上报</a></li>
	 * <li><a th:href="@{/documentManagement}">文件管理</a></li>
	 * <li><a th:href="@{/diskCapacity}">磁盘容量</a></li>
	 * <li><a th:href="@{/device}">设备详情</a></li>
	 */

	/**
	 * 右上角信箱，作为报警器，可以加红点，看完之后红点消失
	 */

	/**
	 * 
	 * redis和cookie?
	 */

	/**
	 * 有哪些人员类别，一个权限一个？（一个公司一个注册） 读取数据，数据拼接，数据量过大，每读一行一发
	 */

	/**
	 * 20220303 thg
	 * 修改了video.html和相应的后端代码，数据库新建视频识别结果的表，还未测试
	 * 在D盘image文件夹下放了结果图片，下次来把它们的信息插入数据库，并进行视频结果页面的测试
	 */

	/**
	 * 20220305 thg
	 * 优化了一些代码结构
	 * 完善了识别结果展示的代码
	 * 从视频中截图并保存的操作从原来通过“diaoyong”改为启动后自动运行
	 * 完善了截图、保存、调用算法、提取识别结果、插入数据库、前端展示的整套流程
	 * 加入车牌识别，录制视频待加入
	 * 尝试使用线程池，但是现在情况是使用线程池不如直接使用Thread类性能好，鉴于现在由于测试只有单线程，可能未来十个线程一起跑的时候线程池性能会好些
	 * 现在使用线程池单跑一个线程就有卡死风险，后续加入录制视频后大概率会直接卡死
	 */

	/**
	 * 20220313 thg
	 * 推流进程改成jar包运行自动启动，不再监测页面行为（原来是有页面再看就推流，没有就结束）
	 * 十路视频可以正常播放，只不过台式机的cpu和内存直接干满了
	 * 我自己的摄像头不知道为什么，有时候推流自动中断，师兄的一切正常
	 */
}
