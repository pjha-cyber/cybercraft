# 🌐 TryHackMe: What is Networking?

A beginner-friendly room introducing the basics of computer networks, the internet, and how devices communicate.

---

## 🧩 Task 1 – What is Networking?

- **Networking** refers to the interconnection of multiple devices (computers, servers, phones, routers, etc.) to share data and resources.
- It allows communication through protocols and physical/virtual infrastructure (e.g., cables, Wi-Fi, switches).
- Networks can be **local** (LAN) or **wide** (WAN).

---

## 🧠 Task 2 – What is the Internet?

- The **Internet** is a massive global network composed of interconnected smaller private and public networks.
- It relies on standardized protocols like **TCP/IP** to enable data exchange.
- **Origin**:
  - Started as **ARPANET** in the late 1960s (US defense project).
  - Evolved into the Internet with the development of **TCP/IP**.
  - The **World Wide Web (WWW)** was invented in 1989 by **Tim Berners-Lee**, enabling websites, links, and browsers.
- **Key distinction**: The Internet is the infrastructure; the Web is a service running on it.

---

## 💻 Task 3 – Identifying Devices on a Network

### 📌 IP Addresses

- **IP (Internet Protocol)** address: A unique numerical label assigned to each device on a network.
- **IPv4**: Format `X.X.X.X` (e.g., `192.168.1.1`), with 4 octets (8-bit blocks), allowing ~4.3 billion unique addresses.
- **IPv6**: Longer format to handle address exhaustion; uses hexadecimal and colons (e.g., `a4:c3:f0:85:ac:2d`).
- Types of IP:
  - **Private IP**: Used within local networks (e.g., `192.168.x.x`, `10.x.x.x`).
  - **Public IP**: Assigned by ISPs to connect to the Internet.
- Devices often use **NAT (Network Address Translation)** to share one public IP among many private IPs.

### 🏷️ MAC Addresses

- **MAC (Media Access Control)** address: A hardware identifier unique to each network interface.
- Format: 12-digit hexadecimal, separated by colons (e.g., `00:1A:2B:3C:4D:5E`).
- Used in **Layer 2 (Data Link Layer)** of the OSI model for local communication.
- Unlike IPs, MAC addresses are **hardware-based**, although they can be **spoofed** (manipulated) for testing or malicious purposes.

---

## 📶 Task 4 – Ping (ICMP)

- **Ping** is a network diagnostic tool used to test reachability of a host and measure latency.
- It sends **ICMP Echo Requests** and listens for Echo Replies.
- Useful for:
  - Checking if a device/server is online.
  - Diagnosing slow or dropped connections.
- **Common usage**:
  ```bash
  ping google.com         # ping a domain
  ping 8.8.8.8            # ping an IP
  ping -c 4 192.168.1.1   # send 4 packets only
-  **Key terms**:
  - RTT (Round Trip Time): Time taken for a packet to go to the destination and return.
  - TTL (Time to Live): Limits the number of hops a packet can take to avoid infinite loops.
