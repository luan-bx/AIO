package com.shark.aio.video.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;


/**
 * 进程类
 * 每个url一个推流进程足够
 * 该类用来记录推流进程的进程id，和正在使用该流的Session
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FfmpegProcess {

    /**
     * 进程id
     */
    private int pid;

    /**
     * 正在拉流的session
     */
    private Set<HttpSession> sessions;
}
